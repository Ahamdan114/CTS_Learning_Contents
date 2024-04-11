package cts.builder_pattern.example.initial;

public class GamingSystem implements IGamingSystem {

    // Mandatory

    private String placaDeBaza;
    private String memorieRAM;
    private String stocareSDD;
    private String placaVideo;

    // Optional

    private String mouse;
    private String tastatura;
    private String  camerWeb;
    private String casti;
    private String scaunGaming;

    GamingSystem(String placaDeBaza, String memorieRAM, String stocareSDD, String placaVideo) {
        this.placaDeBaza = placaDeBaza;
        this.memorieRAM = memorieRAM;
        this.stocareSDD = stocareSDD;
        this.placaVideo = placaVideo;
    }

    GamingSystem setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    GamingSystem setTastatura(String tastatura) {
        this.tastatura = tastatura;
        return this;
    }

    GamingSystem setCamerWeb(String camerWeb) {
        this.camerWeb = camerWeb;
        return this;
    }

    GamingSystem setCasti(String casti) {
        this.casti = casti;
        return this;
    }

    GamingSystem setScaunGaming(String scaunGaming) {
        this.scaunGaming = scaunGaming;
        return this;
    }


    @Override
    public void printConfiguration() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("GamingSystem{");
        stringBuilder.append("placaDeBaza='").append(placaDeBaza).append('\'');
        stringBuilder.append(", memorieRAM='").append(memorieRAM).append('\'');
        stringBuilder.append(", stocareSDD='").append(stocareSDD).append('\'');
        stringBuilder.append(", placaVideo='").append(placaVideo).append('\'');
        stringBuilder.append(", mouse='").append(mouse).append('\'');
        stringBuilder.append(", tastatură='").append(tastatura).append('\'');
        stringBuilder.append(", camerWeb='").append(camerWeb).append('\'');
        stringBuilder.append(", caști='").append(casti).append('\'');
        stringBuilder.append(", scaunGaming='").append(scaunGaming).append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }


}
