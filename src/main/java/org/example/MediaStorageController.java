package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/media-data")
public class MediaStorageController {

    @GetMapping
    public List<MediaStorage> getMediaStorages() {
        return List.of(
                new MediaStorage(1, "https://storage.googleapis.com/exoplayer-test-media-0/BigBuckBunny_320x180.mp4", "Watch this cute cat doing trick #Cats #Funny", "video"),
                new MediaStorage(2, "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3", "Start your day with this amazing podcast #MorningMotivation", "audio"),
                new MediaStorage(3, "/Mohammed_Ibrahim_CV.pdf", "Mohammed Ibrahim's CV", "document"),
                new MediaStorage(4, "", "Just finished building this awesome app! Feeling proud of what we've accomplished. The journey of learning Flutter has been amazing. #FlutterDev #MobileApps #CodingLife", "text")
        );
    }
}
