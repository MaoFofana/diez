import {File} from '@diez/designsystem';
import {join} from 'path';
import {WebBinding} from '../../targets/web.api';
import {sourcesPath} from '../../utils';

const binding: WebBinding<File> = {
  sources: [join(sourcesPath, 'web', 'bindings', 'Color.js')],
  declarations: [join(sourcesPath, 'web', 'bindings', 'Color.d.ts')],
};

export = binding;
