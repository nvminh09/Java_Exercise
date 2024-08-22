package Interface.Searchable;
class Document implements Searchable {
    private String content;
    public Document(String content) {
        this.content = content;
    }
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}