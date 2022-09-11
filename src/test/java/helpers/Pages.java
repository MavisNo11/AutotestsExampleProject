package helpers;

public enum Pages {
    MAIN_URL("https://ya.ru"),
    FULL_URL("https://yandex.ru");

    private String url;

    Pages(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
