// This file was generated with Diez - https://diez.org
// Do not edit this file directly.

import Foundation
import CoreGraphics
@objc(DEZLinearGradient)
public final class LinearGradient: NSObject, Decodable {
    /**
    LinearGradient data.
    **/
    @objc public internal(set) var stops: [GradientStop]
    /**
    LinearGradient data.
    **/
    @objc public internal(set) var start: Point2D
    /**
    LinearGradient data.
    **/
    @objc public internal(set) var end: Point2D

    init(
        stops: [GradientStop],
        start: Point2D,
        end: Point2D
    ) {
        self.stops = stops
        self.start = start
        self.end = end
    }
}

extension LinearGradient: ReflectedCustomStringConvertible {
    public override var description: String {
        return reflectedDescription
    }
}
