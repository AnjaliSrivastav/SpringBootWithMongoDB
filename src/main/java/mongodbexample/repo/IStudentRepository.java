package mongodbexample.repo;

import mongodbexample.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IStudentRepository extends MongoRepository<Student,Integer> {
}
