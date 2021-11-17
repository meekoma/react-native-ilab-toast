
import { NativeModules } from 'react-native';
const { RNToast } = NativeModules;
export const RNModule = {
    showToast(message){
        RNToast.showToast(message)
    }
}
