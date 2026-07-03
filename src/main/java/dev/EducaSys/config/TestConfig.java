package dev.EducaSys.config;

import dev.EducaSys.entities.*;
import dev.EducaSys.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@Profile("h2")
public class TestConfig implements CommandLineRunner {


    public StudentRepository studentRepository;
    public ProfessorRepository professorRepository;
    public CoordinatorRepository coordinatorRepository;
    public InvoiceRepository invoiceRepository;
    public ClassRoomRepository classRoomRepository;
    public SubjectRepository subjectRepository;
    public SubjectAverageRepository subjectAverageRepository;
    public ReportCardRepository reportCardRepository;
    public CourseRepository courseRepository;
    public InstitutionRepository institutionRepository;
    public Group_NameRepository groupNameRepository;

    public TestConfig(StudentRepository studentRepository, ProfessorRepository professorRepository, CoordinatorRepository coordinatorRepository, InvoiceRepository invoiceRepository, ClassRoomRepository classRoomRepository, SubjectRepository subjectRepository, SubjectAverageRepository subjectAverageRepository, ReportCardRepository reportCardRepository, CourseRepository courseRepository, InstitutionRepository institutionRepository, Group_NameRepository groupNameRepository) {
        this.studentRepository = studentRepository;
        this.professorRepository = professorRepository;
        this.coordinatorRepository = coordinatorRepository;
        this.invoiceRepository = invoiceRepository;
        this.classRoomRepository = classRoomRepository;
        this.subjectRepository = subjectRepository;
        this.subjectAverageRepository = subjectAverageRepository;
        this.reportCardRepository = reportCardRepository;
        this.courseRepository = courseRepository;
        this.institutionRepository = institutionRepository;
        this.groupNameRepository = groupNameRepository;
    }

    @Override
    public void run(String... args){


        //Students
        Student s1 = new Student(null, "Luiz Henrique Silva", "4568-5843", "Rua do Conchavo, 1234", "luizhenrique15@gmail.com", "234.546.657-45");
        Student s2 = new Student(null, "Mario Paulo Siqueira", "4573-2836","Avenida Paulista, 20000", "mariosiqueira95@gmail.com", "472.234.234-23");
        Student s3 = new Student(null, "Ana Beatriz Costa", "4895-1234", "Rua das Flores, 45", "anabeatriz@gmail.com", "123.456.789-10");
        Student s4 = new Student(null, "Carlos Eduardo Lima", "4782-5678", "Avenida Brasil, 890", "carlos.lima@gmail.com", "234.567.890-11");
        Student s5 = new Student(null, "Fernanda Oliveira", "4678-9123", "Rua das Acácias, 321", "fernandaoliveira@gmail.com", "345.678.901-22");
        Student s6 = new Student(null, "Gabriel Martins", "4567-3456", "Rua XV de Novembro, 78", "gabrielmartins@gmail.com", "456.789.012-33");
        Student s7 = new Student(null, "Juliana Pereira", "4456-7890", "Avenida Central, 456", "julianap@gmail.com", "567.890.123-44");
        Student s8 = new Student(null, "Lucas Almeida", "4345-2345", "Rua São João, 987", "lucasalmeida@gmail.com", "678.901.234-55");
        Student s9 = new Student(null, "Mariana Souza", "4234-8765", "Rua das Palmeiras, 159", "marianasouza@gmail.com", "789.012.345-66");
        Student s10 = new Student(null, "Pedro Henrique Rocha", "4123-6543", "Avenida Independência, 741", "pedrorocha@gmail.com", "890.123.456-77");
        Student s11 = new Student(null, "Rafael Gomes", "4012-1111", "Rua Monte Alegre, 963", "rafaelgomes@gmail.com", "901.234.567-88");
        Student s12 = new Student(null, "Camila Rodrigues", "4901-2222", "Rua Bela Vista, 852", "camilarodrigues@gmail.com", "012.345.678-99");
        Student s13 = new Student(null, "Bruno Ferreira", "4790-3333", "Rua do Comércio, 147", "brunoferreira@gmail.com", "135.246.357-10");
        Student s14 = new Student(null, "Patrícia Nunes", "4689-4444", "Avenida dos Estados, 258", "patricianunes@gmail.com", "246.357.468-21");
        Student s15 = new Student(null, "Ricardo Mendes", "4578-5555", "Rua das Laranjeiras, 369", "ricardomendes@gmail.com", "357.468.579-32");
        studentRepository.saveAll(Arrays.asList(s1,s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15));


        //Pofessors
        Professor p1 = new Professor(null, "Clodoaldo Mathias Silva", "8475-2746", "Rua das Margaridas, 45", "clodoaldosilva45@gmail.com", "856.475.432-23", 2234.34);
        Professor p2 = new Professor(null, "Jusescleida Maria dos Santos", "4857-1323", "Rua dos Boticos, 94", "jusescleide@gmail.com", "837.283.928-12", 6455.21);
        Professor p3 = new Professor(null, "Roberto Almeida", "4198-3456", "Rua das Acácias, 120", "roberto.almeida@gmail.com", "123.456.789-01", 5120.75);
        Professor p4 = new Professor(null, "Patrícia Fernandes", "4287-4567", "Avenida Central, 345", "patricia.fernandes@gmail.com", "234.567.890-12", 6890.50);
        Professor p5 = new Professor(null, "Eduardo Costa", "4376-5678", "Rua São Pedro, 89", "eduardo.costa@gmail.com", "345.678.901-23", 4725.30);
        Professor p6 = new Professor(null, "Renata Oliveira", "4465-6789", "Rua das Palmeiras, 567", "renata.oliveira@gmail.com", "456.789.012-34", 7310.00);
        Professor p7 = new Professor(null, "Marcelo Souza", "4554-7890", "Avenida Brasil, 789", "marcelo.souza@gmail.com", "567.890.123-45", 5845.20);
        Professor p8 = new Professor(null, "Luciana Martins", "4643-8901", "Rua XV de Novembro, 321", "luciana.martins@gmail.com", "678.901.234-56", 6200.90);
        Professor p9 = new Professor(null, "Fernando Ribeiro", "4732-9012", "Rua Bela Vista, 741", "fernando.ribeiro@gmail.com", "789.012.345-67", 5580.40);
        Professor p10 = new Professor(null, "Cristiane Lopes", "4821-0123", "Avenida Independência, 852", "cristiane.lopes@gmail.com", "890.123.456-78", 7450.80);
        Professor p11 = new Professor(null, "André Gomes", "4910-1234", "Rua do Comércio, 963", "andre.gomes@gmail.com", "901.234.567-89", 4950.15);
        Professor p12 = new Professor(null, "Vanessa Carvalho", "4009-2345", "Rua das Flores, 147", "vanessa.carvalho@gmail.com", "012.345.678-90", 6785.65);
        Professor p13 = new Professor(null, "Ricardo Nogueira", "4197-3456", "Rua Monte Alegre, 258", "ricardo.nogueira@gmail.com", "135.246.357-91", 5360.25);
        Professor p14 = new Professor(null, "Sílvia Mendes", "4286-4567", "Avenida Paulista, 159", "silvia.mendes@gmail.com", "246.357.468-02", 7925.35);
        Professor p15 = new Professor(null, "Paulo Henrique Batista", "4375-5678", "Rua das Laranjeiras, 753", "paulo.batista@gmail.com", "357.468.579-13", 6100.00);
        professorRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15));


        //Coordinators
        Coordinator c1 = new Coordinator(null, "Clademario Ademiro Culler", "4756-3847", "Rua das Cotovias, 47", "clademario345@gmail.com", "847.847.473-34", 6846.34);
        Coordinator c2 = new Coordinator(null, "Mariana Ferreira", "4123-4567", "Rua das Palmeiras, 102", "mariana.ferreira@gmail.com", "123.456.789-01", 7250.00);
        Coordinator c3 = new Coordinator(null, "Carlos Henrique Souza", "4234-5678", "Avenida Brasil, 450", "carlos.souza@gmail.com", "234.567.890-12", 6985.50);
        Coordinator c4 = new Coordinator(null, "Patrícia Almeida", "4345-6789", "Rua das Flores, 87", "patricia.almeida@gmail.com", "345.678.901-23", 7540.25);
        Coordinator c5 = new Coordinator(null, "Fernando Oliveira", "4456-7890", "Rua XV de Novembro, 156", "fernando.oliveira@gmail.com", "456.789.012-34", 7815.80);
        Coordinator c6 = new Coordinator(null, "Luciana Gomes", "4567-8901", "Avenida Independência, 963", "luciana.gomes@gmail.com", "567.890.123-45", 7100.40);
        Coordinator c7 = new Coordinator(null, "Ricardo Martins", "4678-9012", "Rua Bela Vista, 741", "ricardo.martins@gmail.com", "678.901.234-56", 6890.90);
        Coordinator c8 = new Coordinator(null, "Camila Ribeiro", "4789-0123", "Rua São João, 258", "camila.ribeiro@gmail.com", "789.012.345-67", 8025.10);
        Coordinator c9 = new Coordinator(null, "Eduardo Nunes", "4890-1234", "Rua do Comércio, 369", "eduardo.nunes@gmail.com", "890.123.456-78", 7455.75);
        Coordinator c10 = new Coordinator(null, "Juliana Costa", "4901-2345", "Avenida Central, 654", "juliana.costa@gmail.com", "901.234.567-89", 7300.00);
        Coordinator c11 = new Coordinator(null, "Roberto Carvalho", "4012-3456", "Rua das Acácias, 135", "roberto.carvalho@gmail.com", "012.345.678-90", 8120.35);
        Coordinator c12 = new Coordinator(null, "Vanessa Lima", "4123-9876", "Rua Monte Alegre, 579", "vanessa.lima@gmail.com", "135.246.357-91", 6945.20);
        Coordinator c13 = new Coordinator(null, "Marcelo Pereira", "4234-8765", "Avenida Paulista, 812", "marcelo.pereira@gmail.com", "246.357.468-02", 7780.60);
        Coordinator c14 = new Coordinator(null, "Cristiane Batista", "4345-7654", "Rua das Laranjeiras, 924", "cristiane.batista@gmail.com", "357.468.579-13", 7205.45);
        Coordinator c15 = new Coordinator(null, "André Luiz Moraes", "4456-6543", "Rua dos Ipês, 213", "andre.moraes@gmail.com", "468.579.680-24", 8350.90);
        coordinatorRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15));


        //Invoice
        Invoice in1 = new Invoice(null, LocalDateTime.parse("2023-01-05T00:00:00"), LocalDateTime.parse("2023-02-05T00:00:00"), 1050.58);
        Invoice in2 = new Invoice(null, LocalDateTime.parse("2023-02-10T00:00:00"), LocalDateTime.parse("2023-03-10T00:00:00"), 890.75);
        Invoice in3 = new Invoice(null, LocalDateTime.parse("2023-03-15T00:00:00"), LocalDateTime.parse("2023-04-15T00:00:00"), 1320.40);
        Invoice in4 = new Invoice(null, LocalDateTime.parse("2023-04-01T00:00:00"), LocalDateTime.parse("2023-05-01T00:00:00"), 765.30);
        Invoice in5 = new Invoice(null, LocalDateTime.parse("2023-05-20T00:00:00"), LocalDateTime.parse("2023-06-20T00:00:00"), 1540.00);
        Invoice in6 = new Invoice(null, LocalDateTime.parse("2023-06-12T00:00:00"), LocalDateTime.parse("2023-07-12T00:00:00"), 980.15);
        Invoice in7 = new Invoice(null, LocalDateTime.parse("2023-07-08T00:00:00"), LocalDateTime.parse("2023-08-08T00:00:00"), 1199.99);
        Invoice in8 = new Invoice(null, LocalDateTime.parse("2023-08-25T00:00:00"), LocalDateTime.parse("2023-09-25T00:00:00"), 670.80);
        Invoice in9 = new Invoice(null, LocalDateTime.parse("2023-09-18T00:00:00"), LocalDateTime.parse("2023-10-18T00:00:00"), 1435.60);
        Invoice in10 = new Invoice(null, LocalDateTime.parse("2023-10-05T00:00:00"), LocalDateTime.parse("2023-11-05T00:00:00"), 1120.45);

        Invoice in11 = new Invoice(null, LocalDateTime.parse("2023-11-14T00:00:00"), LocalDateTime.parse("2023-12-14T00:00:00"), 845.20);
        Invoice in12 = new Invoice(null, LocalDateTime.parse("2023-12-03T00:00:00"), LocalDateTime.parse("2024-01-03T00:00:00"), 950.00);
        Invoice in13 = new Invoice(null, LocalDateTime.parse("2024-01-09T00:00:00"), LocalDateTime.parse("2024-02-09T00:00:00"), 1780.35);
        Invoice in14 = new Invoice(null, LocalDateTime.parse("2024-02-22T00:00:00"), LocalDateTime.parse("2024-03-22T00:00:00"), 1025.90);
        Invoice in15 = new Invoice(null, LocalDateTime.parse("2024-03-11T00:00:00"), LocalDateTime.parse("2024-04-11T00:00:00"), 1340.75);
        Invoice in16 = new Invoice(null, LocalDateTime.parse("2024-04-28T00:00:00"), LocalDateTime.parse("2024-05-28T00:00:00"), 890.10);
        Invoice in17 = new Invoice(null, LocalDateTime.parse("2024-05-17T00:00:00"), LocalDateTime.parse("2024-06-17T00:00:00"), 2100.00);
        Invoice in18 = new Invoice(null, LocalDateTime.parse("2024-06-06T00:00:00"), LocalDateTime.parse("2024-07-06T00:00:00"), 730.65);
        Invoice in19 = new Invoice(null, LocalDateTime.parse("2024-07-19T00:00:00"), LocalDateTime.parse("2024-08-19T00:00:00"), 1675.50);
        Invoice in20 = new Invoice(null, LocalDateTime.parse("2024-08-30T00:00:00"), LocalDateTime.parse("2024-09-30T00:00:00"), 990.90);

        Invoice in21 = new Invoice(null, LocalDateTime.parse("2024-09-13T00:00:00"), LocalDateTime.parse("2024-10-13T00:00:00"), 1255.25);
        Invoice in22 = new Invoice(null, LocalDateTime.parse("2024-10-07T00:00:00"), LocalDateTime.parse("2024-11-07T00:00:00"), 845.55);
        Invoice in23 = new Invoice(null, LocalDateTime.parse("2024-11-26T00:00:00"), LocalDateTime.parse("2024-12-26T00:00:00"), 1599.95);
        Invoice in24 = new Invoice(null, LocalDateTime.parse("2024-12-15T00:00:00"), LocalDateTime.parse("2025-01-15T00:00:00"), 1180.30);
        Invoice in25 = new Invoice(null, LocalDateTime.parse("2025-01-04T00:00:00"), LocalDateTime.parse("2025-02-04T00:00:00"), 920.40);
        Invoice in26 = new Invoice(null, LocalDateTime.parse("2025-02-18T00:00:00"), LocalDateTime.parse("2025-03-18T00:00:00"), 1460.85);
        Invoice in27 = new Invoice(null, LocalDateTime.parse("2025-03-27T00:00:00"), LocalDateTime.parse("2025-04-27T00:00:00"), 810.75);
        Invoice in28 = new Invoice(null, LocalDateTime.parse("2025-04-09T00:00:00"), LocalDateTime.parse("2025-05-09T00:00:00"), 1735.60);
        Invoice in29 = new Invoice(null, LocalDateTime.parse("2025-05-21T00:00:00"), LocalDateTime.parse("2025-06-21T00:00:00"), 1075.95);
        Invoice in30 = new Invoice(null, LocalDateTime.parse("2025-06-30T00:00:00"), LocalDateTime.parse("2025-07-30T00:00:00"), 1299.99);
        invoiceRepository.saveAll(Arrays.asList(in1, in2, in3, in4, in5, in6, in7, in8, in9, in10, in11, in12, in13, in14, in15, in16, in17, in18, in19, in20, in21, in22, in23, in24, in25, in26, in27, in28, in29, in30));


        //ClassRooms
        ClassRoom class1 = new ClassRoom(null, "1st Sem", 'A', 35, "Night");
        ClassRoom class2 = new ClassRoom(null, "1st Sem", 'B', 35, "Night");
        ClassRoom class3 = new ClassRoom(null, "1st Sem", 'C', 35, "Morning");
        ClassRoom class4 = new ClassRoom(null, "1st Sem", 'D', 35, "Afternoon");

        ClassRoom class5 = new ClassRoom(null, "2nd Sem", 'A', 35, "Morning");
        ClassRoom class6 = new ClassRoom(null, "2nd Sem", 'B', 35, "Afternoon");
        ClassRoom class7 = new ClassRoom(null, "2nd Sem", 'C', 35, "Night");
        ClassRoom class8 = new ClassRoom(null, "2nd Sem", 'D', 35, "Morning");

        ClassRoom class9 = new ClassRoom(null, "3rd Sem", 'A', 40, "Morning");
        ClassRoom class10 = new ClassRoom(null, "3rd Sem", 'B', 40, "Afternoon");
        ClassRoom class11 = new ClassRoom(null, "3rd Sem", 'C', 40, "Night");
        ClassRoom class12 = new ClassRoom(null, "3rd Sem", 'D', 40, "Morning");

        ClassRoom class13 = new ClassRoom(null, "4th Sem", 'A', 30, "Afternoon");
        ClassRoom class14 = new ClassRoom(null, "4th Sem", 'B', 30, "Night");
        ClassRoom class15 = new ClassRoom(null, "4th Sem", 'C', 30, "Morning");
        classRoomRepository.saveAll(Arrays.asList(class1, class2, class3, class4, class5, class6, class7, class8, class9, class10, class11, class12, class13, class14, class15));


        //Subject
        //Ensino Fundamental
        Subject sub1 = new Subject(null, "Matemática", 2);
        Subject sub2 = new Subject(null, "Português", 85);
        Subject sub3 = new Subject(null, "História", 60);
        Subject sub4 = new Subject(null, "Geografia", 70);
        Subject sub5 = new Subject(null, "Física", 80);
        Subject sub6 = new Subject(null, "Química", 75);
        Subject sub7 = new Subject(null, "Biologia", 65);
        Subject sub8 = new Subject(null, "Inglês", 90);
        Subject sub9 = new Subject(null, "Espanhol", 50);
        Subject sub10 = new Subject(null, "Artes", 40);
        Subject sub11 = new Subject(null, "Educação Física", 95);
        Subject sub12 = new Subject(null, "Filosofia", 55);
        Subject sub13 = new Subject(null, "Sociologia", 45);
        Subject sub14 = new Subject(null, "Literatura", 68);
        Subject sub15 = new Subject(null, "Informática", 88);
        subjectRepository.saveAll(Arrays.asList(sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9, sub10, sub11, sub12, sub13, sub14, sub15));


        //Subject Average
        SubjectAverage subAvg1 = new SubjectAverage(null, 8.0, 3.0, 5.0);
        SubjectAverage subAvg2 = new SubjectAverage(null, 7.0, 9.0, 10.0);
        SubjectAverage subAvg3 = new SubjectAverage(null, 6.5, 8.0, 7.5);
        SubjectAverage subAvg4 = new SubjectAverage(null, 9.0, 8.5, 9.5);
        SubjectAverage subAvg5 = new SubjectAverage(null, 5.0, 6.0, 5.5);
        SubjectAverage subAvg6 = new SubjectAverage(null, 4.5, 7.0, 6.0);
        SubjectAverage subAvg7 = new SubjectAverage(null, 10.0, 9.5, 9.8);
        SubjectAverage subAvg8 = new SubjectAverage(null, 7.5, 7.0, 8.0);
        SubjectAverage subAvg9 = new SubjectAverage(null, 3.0, 4.0, 3.5);
        SubjectAverage subAvg10 = new SubjectAverage(null, 8.5, 8.0, 9.0);
        SubjectAverage subAvg11 = new SubjectAverage(null, 6.0, 5.5, 6.5);
        SubjectAverage subAvg12 = new SubjectAverage(null, 9.5, 10.0, 9.7);
        SubjectAverage subAvg13 = new SubjectAverage(null, 2.5, 3.5, 4.0);
        SubjectAverage subAvg14 = new SubjectAverage(null, 7.8, 8.2, 8.0);
        SubjectAverage subAvg15 = new SubjectAverage(null, 5.8, 6.8, 6.3);
        subjectAverageRepository.saveAll(Arrays.asList(subAvg1, subAvg2, subAvg3, subAvg4, subAvg5, subAvg6, subAvg7, subAvg8, subAvg9, subAvg10, subAvg11, subAvg12, subAvg13, subAvg14, subAvg15));


        //Report Card
        ReportCard rp1 = new ReportCard(null);
        ReportCard rp2 = new ReportCard(null);
        ReportCard rp3 = new ReportCard(null);
        ReportCard rp4 = new ReportCard(null);
        ReportCard rp5 = new ReportCard(null);
        ReportCard rp6 = new ReportCard(null);
        ReportCard rp7 = new ReportCard(null);
        ReportCard rp8 = new ReportCard(null);
        ReportCard rp9 = new ReportCard(null);
        ReportCard rp10 = new ReportCard(null);
        ReportCard rp11 = new ReportCard(null);
        ReportCard rp12 = new ReportCard(null);
        ReportCard rp13 = new ReportCard(null);
        ReportCard rp14 = new ReportCard(null);
        ReportCard rp15 = new ReportCard(null);
        reportCardRepository.saveAll(Arrays.asList(rp1, rp2, rp3, rp4, rp5, rp6, rp7, rp8, rp9, rp10, rp11, rp12, rp13, rp14, rp15));


        //Course
        Course course1 = new Course(null, "Elementary School", 1000);
        Course course2 = new Course(null, "high School", 1000);
        Course course3 = new Course(null, "College", 1000);
        courseRepository.saveAll(Arrays.asList(course1, course2, course3));


        //Institution
        Institution inst1 = new Institution(null, "Real Basic School", "Elementary School", "Elementary School Institution");
        Institution inst2 = new Institution(null, "Real High School", "High School", "Elementary School Institution");
        Institution inst3 = new Institution(null, "Real College", "College", "College Institution");
        institutionRepository.saveAll(Arrays.asList(inst1, inst2, inst3));


        //Group_Name
        Group_Name groupName = new Group_Name(null, "Real Education", "44.521.907/0001-44", "Education institution");
        groupNameRepository.save(groupName);
    }
}
