package Ex_4_V_1;

public class Program {
    public static void main(String[] args) {
        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 track 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }

        Repository videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideContent("film_001.vmw"));
        videoStorage.add(new VideContent("03 film 03.3gp"));

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

        //#region Проблема
        audioStorage.add(new VideContent("film_4.mp4"));
        videoStorage.add(new AudioContent("track_004.mp3"));
        //#endregion
    }
}
