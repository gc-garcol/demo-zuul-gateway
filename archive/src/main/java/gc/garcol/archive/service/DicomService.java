package gc.garcol.archive.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author garcol
 */
public interface DicomService {

    void uploadDicomFiles(MultipartFile file);

}
