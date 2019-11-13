// This file was generated with Diez - https://diez.org
// Do not edit this file directly.

package org.diez.stdlibTestStub

import android.graphics.Shader
import android.graphics.LinearGradient
import android.graphics.drawable.ShapeDrawable

/**
  Provides a linear gradient.
**/
data class LinearGradient(
    /**
      LinearGradient data.
    **/
    val stops: Array<GradientStop>,
    /**
      LinearGradient data.
    **/
    val start: Point2D,
    /**
      LinearGradient data.
    **/
    val end: Point2D
) {
    companion object {}

    private class LinearGradientShaderFactory(val startX: Float, val startY: Float, val endX: Float, val endY: Float,
                                              private val colors: IntArray,
                                              private val positions: FloatArray): ShapeDrawable.ShaderFactory() {
        override fun resize(width: Int, height: Int): Shader {
            return LinearGradient(
                width * startX,
                height * startY,
                width * endX,
                height * endY,
                colors,
                positions,
                Shader.TileMode.CLAMP)
        }
    }

    val shaderFactory: ShapeDrawable.ShaderFactory
        get() {
            return LinearGradientShaderFactory(
                start.x, start.y,
                end.x, end.y,
                stops.map({ it.color.color }).toIntArray(),
                stops.map({ it.position }).toFloatArray())
        }
}
