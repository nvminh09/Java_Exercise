package Interface.Searchable;
class WebPage implements Searchable {
    private String url;
    private String htmlContent;
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }
    public boolean search(String keyword) {
        return htmlContent.contains(keyword);
    }
}