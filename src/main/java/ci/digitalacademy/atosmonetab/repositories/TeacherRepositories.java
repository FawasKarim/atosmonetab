package ci.digitalacademy.atosmonetab.repositories;

import ci.digitalacademy.atosmonetab.models.Student;
import ci.digitalacademy.atosmonetab.models.Teacher;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepositories extends JpaRepository<Teacher, Long> {
}
