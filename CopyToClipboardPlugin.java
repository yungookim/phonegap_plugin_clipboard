import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.ClipboardManager;

/**
 * This class echoes a string called from JavaScript.
 */
@SuppressWarnings("deprecation")
public class CopyToClipboardPlugin extends Plugin {
    private static final String actionCopy = "copy";
    private static final String actionPaste = "paste";
    
    /**
     * Executes the request and returns PluginResult.
     *
     * @param action        The action to execute.
     * @param args          JSONArry of arguments for the plugin.
     * @param callbackId    The callback id used when calling back into JavaScript.
     * @return              A PluginResult object with a status and message.
     */
    @SuppressLint("NewApi")
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            ClipboardManager clipboard = (ClipboardManager) this.ctx.getSystemService(Context.CLIPBOARD_SERVICE);
            if (action.equals(actionCopy)){
                String arg = args.getString(0);
                if (arg != null && arg.length() > 0){
                    clipboard.setText(arg);
                    return new PluginResult(PluginResult.Status.OK, arg);
                } else {
                    return new PluginResult(PluginResult.Status.ERROR);
                }
            } else if (action.equals(actionPaste)){
                String arg = (String) clipboard.getText();
                if (arg == null) {
                    arg = "";
                }
                return new PluginResult(PluginResult.Status.OK, arg);
            } else {
                return new PluginResult(PluginResult.Status.INVALID_ACTION);
            }
        } catch (JSONException e) {
            return new PluginResult(PluginResult.Status.JSON_EXCEPTION);
        }
    }
}