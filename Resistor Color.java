class ResistorColor {
    private String[] colour={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    int colorCode(String color) {
        for(int i=0;i<10;i++){
            if(color==colour[i])
                return i;
        }
        return 0;
    }

    String[] colors() {
        return colors;
    }
}
