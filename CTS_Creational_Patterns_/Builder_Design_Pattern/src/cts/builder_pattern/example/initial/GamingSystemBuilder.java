package cts.builder_pattern.example.initial;

public final class GamingSystemBuilder implements IGamingSystemBuilder {
    private GamingSystem system;

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

    public GamingSystemBuilder(String placaDeBaza, String memorieRAM, String stocareSDD, String placaVideo) {
        this.placaDeBaza = placaDeBaza;
        this.memorieRAM = memorieRAM;
        this.stocareSDD = stocareSDD;
        this.placaVideo = placaVideo;
    }

    @Override
    public void buildPlacaDeBaza(String placaDeBaza) {
        this.placaDeBaza = placaDeBaza;
    }

    @Override
    public void buildMemorieRAM(String memorieRAM) {
        this.memorieRAM = memorieRAM;
    }

    @Override
    public void buildStocareSDD(String stocareSDD) {
        this.stocareSDD = stocareSDD;
    }

    @Override
    public void buildPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public GamingSystemBuilder setMouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public GamingSystemBuilder setTastatura(String tastatura) {
        this.tastatura = tastatura;
        return this;
    }

    public GamingSystemBuilder setCamerWeb(String camerWeb) {
        this.camerWeb = camerWeb;
        return this;
    }

    public GamingSystemBuilder setCasti(String casti) {
        this.casti = casti;
        return this;
    }

    public GamingSystemBuilder setScaunGaming(String scaunGaming) {
        this.scaunGaming = scaunGaming;
        return this;
    }

//    private String mouse;
//    private String tastatura;
//    private String  camerWeb;
//    private String casti;
//    private String scaunGaming;


    public GamingSystem build() {
        return new GamingSystem(placaDeBaza, memorieRAM, stocareSDD, placaVideo)
                .setMouse(this.mouse)
                .setTastatura(this.tastatura)
                .setCamerWeb(this.camerWeb)
                .setCasti(this.casti)
                .setScaunGaming(this.scaunGaming);
    }
}
