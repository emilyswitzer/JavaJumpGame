public enum Season {

    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);

    private int season;

    Season(int season) {
        this.season = season;
    }
    public String toString() {
        switch(season) {
            case 1:
                return "Spring";
            case 2:
                return "Summer";
            case 3:
                return "Autumn";
            default:
                return "Winter";
        }
    }
}



