class ResistorColor {
    int colorCode(String color) {
        String[] colour={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        for(int i=0;i<10;i++){
            if(color==colour[i])
                return i;
        }
        return 0;
    }

    String[] colors() {
        String[] colors={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colors;
    }
}