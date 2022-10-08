package Ex_4_HomeTask;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repos("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 track 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }

        //#region Homework (foreach)
        for (var audio : audioStorage) {
            System.out.println(audio);
        }
        //#endregion


        Repository<VideContent> videoStorage = new Repos("videoStorage");
        videoStorage.add(new VideContent("film_001.vmw"));
        videoStorage.add(new VideContent("03 film 03.3gp"));

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

        Repository<VideContent> videoStorage1 = new Repos("videoStorage1");
        videoStorage.add(new VideContent("film_002.vmw"));
        videoStorage.add(new VideContent("05 film 05.3gp"));


        //#region Homework (merge)
        videoStorage.merge(videoStorage1);
        for (var video : videoStorage) {
            System.out.println(video);
        }
        //#endregion

        //#region Проблема
//        audioStorage.add(new VideContent("film_4.mp4"));
//        videoStorage.add(new AudioContent("track_004.mp3"));
        //#endregion


        //#region
//        Repository<String> stringRepository = new Repository<>("stringRepository");
//        stringRepository.add("King");
//        stringRepository.add("Dad");
//        stringRepository.add("Mom");
//        stringRepository.add("Cat");
//        for (int i = 0; i < stringRepository.count(); i++) {
//            System.out.println(stringRepository.get(i));
//        }
        //#endregion
    }
}
