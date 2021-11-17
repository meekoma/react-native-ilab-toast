
import { NativeModules } from 'react-native';
const { RNIlabToast } = NativeModules;
export const RNIlabToastModule = {
    showToast(message){
        RNIlabToast.showToast(message)
    }
}

