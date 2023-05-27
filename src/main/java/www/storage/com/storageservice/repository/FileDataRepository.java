package www.storage.com.storageservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import www.storage.com.storageservice.entity.FileData;

import java.util.Optional;

@Repository
public interface FileDataRepository extends JpaRepository<FileData,Long> {
    Optional<FileData> findByName(String fileName);
}
