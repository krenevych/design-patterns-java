public class Main {

    public static void main(String[] args) {

        String fileName = "youtubevideo.ogg";
        String format = "mp4";

        VideoFile videoFile = new VideoFile(fileName,
            new Buffer("Byte buffer of video"),
            new Buffer("Byte buffer of audio"));

        videoFile.play(new MPEG4CompressionCodec()); // програємо файл не правильним кодеком
//        videoFile.play(new OggCompressionCodec());   // програємо файл правильним кодеком
        // оскільки у клієнта доступний лише кодек "mp4" потрібно провести
        // конвертацію "youtubevideo.ogg" з формату "ogg" у формат "mp4"

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");
        Codec sourceCodec = CodecFactory.extract(videoFile);

        Codec destinationCodec = new MPEG4CompressionCodec();
        Buffer buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile videoFileConverted = BitrateReader.convert(buffer, videoFile.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(videoFileConverted, videoFile.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        videoFileConverted.play(new MPEG4CompressionCodec());
    }
}
