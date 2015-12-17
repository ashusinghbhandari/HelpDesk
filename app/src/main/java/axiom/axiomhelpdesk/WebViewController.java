package axiom.axiomhelpdesk;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewController extends WebViewClient {

/*
*  override shouldOverrideUrlLoading method in order to load web page
*/
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}