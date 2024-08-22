package Interface.Searchable;
public class Main {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document.");
        boolean documentContainsKeyword = document.search("sample");
        System.out.println("Document contain keyword 'sample': " + documentContainsKeyword);
        // Create an instance of the WebPage class with a sample URL and HTML content
        WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage");
        boolean webPageContainsKeyword = webPage.search("webpage");
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
    }
}