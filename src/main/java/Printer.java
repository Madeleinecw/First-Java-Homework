public class Printer {

    public int paperCount;
    public int tonerVolume;

    public Printer(int paperCount, int tonerVolume){
        this.paperCount = paperCount;
        this.tonerVolume = tonerVolume;
    }


    public int print(int pages, int copies){
        int sheetsUsed = pages * copies;
        if(this.paperCount >= sheetsUsed & this.tonerVolume >= sheetsUsed){
            this.paperCount -= sheetsUsed;
            this.tonerVolume -= sheetsUsed;
        }
        return this.paperCount;
    }

}
