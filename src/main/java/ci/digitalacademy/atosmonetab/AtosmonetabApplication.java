package ci.digitalacademy.atosmonetab;

import ci.digitalacademy.atosmonetab.models.*;
import ci.digitalacademy.atosmonetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class AtosmonetabApplication implements CommandLineRunner  {

	@Autowired
	private UserService userService;

	@Autowired
	private AdressService adressService;

	@Autowired
	private TeacherService teacherService;
//
	@Autowired
	private NoteSheetService noteSheetService;

	@Autowired
	private StudentService studentServices;


	public static void main(String[] args) {
		SpringApplication.run(AtosmonetabApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Teacher teacher = new Teacher();
//		teacher.setVacant(true);
//		teacher.setMatiereEnseigne("java");
//		teacher.setProchainCours("python");
//		teacher.setSujetProchaineReunion("Devoir");
//		teacherService.save(teacher);
////		teacher.setNoteSheet(noteSheet);
//
//
//		NoteSheet noteSheet = new NoteSheet();
//		noteSheet.setNote("12");
//		noteSheet.setAnnee("2024");
//		noteSheet.setTeacher(teacher);
//		noteSheetService.save(noteSheet);
//
////		noteSheet.setTeacher(teacher);
//
//
//
//
//		List<Teacher> teachers = teacherService.findAll();
//		System.out.println(teachers);
//
//		Set<NoteSheet> noteSheets = teachers.get(0).getNoteSheet();
//		System.out.println(noteSheets);





	@Override
	public void run(String... args) throws Exception {

		//Insertion des informations relatives à l'étudiant dans notre Table
		Student student = new Student();
		student.setMatricule("AB-001");
		student.setEmail("fawas@gmail.com");
		student.setFirstName("Fawas");
		student.setLastName("Karim");
		student.setClasse("ADA PYTHON");
		student.setSexe(true);
		student.setDateNaissance(LocalDate.of(2005,5, 25));
		student.setTel("0778198205");
		student.setVille("Abidjan");


		Student student1 = new Student();
		student1.setMatricule("AB-001");
		student1.setEmail("fawas01@gmail.com");
		student1.setFirstName("Fawas1");
		student1.setLastName("Karim1");
		student1.setClasse("ADA JAVA");
		student1.setSexe(true);
		student1.setDateNaissance(LocalDate.of(2005,5, 25));
		student1.setTel("0778198206");
		student1.setVille("Daloa");

		studentServices.save(student);
		studentServices.save(student1);
		System.out.println(student);

		//Inseertion des information relatives aux teachers dans notre Table

		Teacher teacher = new Teacher();
		teacher.setFirstName("Kodjo");
		teacher.setLastName("Gbahou");
		teacher.setEmail("kodjo@gmail.com");
		teacher.setMatiereEnseigne("JAVA");
		teacher.setProchainCours("Les relations");
		teacher.setSujetProchaineReunion("Modifiaction des infos sur notre page Updat");
		teacher.setVacant(true);
		teacher.setDateNaissance(LocalDate.of(1901,01, 01));
		teacher.setTel("0575976946");
		teacher.setVille("ABIDJAN");
		teacherService.save(teacher);

		Teacher teacher1 = new Teacher();
		teacher1.setFirstName("GONEDRE");
		teacher1.setLastName("WILFRIED");
		teacher1.setEmail("gonedre@gmail.com");
		teacher1.setMatiereEnseigne("PYTHON");
		teacher1.setProchainCours("Affichage des Information Sur notre Liste HTML");
		teacher1.setSujetProchaineReunion("Modifiaction des infos sur notre page Update");
		teacher1.setVacant(false);
		teacher1.setDateNaissance(LocalDate.of(1902,01, 01));
		teacher1.setTel("0575976936");
		teacher1.setVille("ABIDJAN");
		teacherService.save(teacher1);

		User user = new User();
		user.setSpeudo("Karim");
		user.setPassword("admin");
		user.setCreationdate(Instant.now());
		userService.save(user);

		User user1 = new User();
		user1.setSpeudo("Fawas");
		user1.setPassword("admin");
		user1.setCreationdate(Instant.now());
		userService.save(user1);







//     /**
//		//Adress adress = new Adress(null, "C.I", "Abidjan", "Rue 12"  );
//	  //Address address = new Address();
//		address.setCountry("Nigeria");
//		address.setCity("Lagos");
//		address.setStreet("Rue Noguess");
//		User user = new User(null,"Karim","1234",Instant.now(), address);
//
//	    //Affiche la liste de l'utilisateur
//		List<User> users = userService.findAll();
//		List<Address> addressList = adressService.findAll();
//
//
//		//adressService.save(address);
//		//userService.save(user);
//		//System.out.println(user);
//		System.out.println(address);
//    **/
//
//		//Teacher teacher = new Teacher();
//		//NoteSheet noteSheet = new NoteSheet();
//
//		//Teacher teacher = new Teacher(null,)

//	NoteFile noteFile1 = new NoteFile();
//        noteFile1.setNote("12");
//        noteFile1.setAnnee("2023");
//	NoteFile noteFile2 = new NoteFile();
//        noteFile2.setNote("16");
//        noteFile2.setAnnee("2024");
//
//        noteFileService.save(noteFile1);
//        noteFileService.save(noteFile2);
//
//	Set<NoteFile> noteFiles = new HashSet<>();
//        noteFiles.add(noteFile1);
//        noteFiles.add(noteFile2);
//
//	Teacher teacher = new Teacher();
//        teacher.setVacant(true);
//        teacher.setMatiereEnseigne("java");
//        teacher.setProchainCours("python");
//        teacher.setSujetProchaineReunion("Devoir");
//        teacher.setNoteFiles(noteFiles);
//        teacherService.save(teacher);
//
//
//
	}
}
