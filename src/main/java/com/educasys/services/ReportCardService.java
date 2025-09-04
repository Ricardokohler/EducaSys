package com.educasys.services;

import com.educasys.entitites.ReportCard;
import com.educasys.repositories.ReportCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportCardService {


    //Injeção de dependência
    private final ReportCardRepository repository;

    public ReportCardService(ReportCardRepository repository) {
        this.repository = repository;
    }


    //create
    public ReportCard createReportCard(ReportCard reportCard){
        return repository.save(reportCard);
    }

    //get all
    public Optional <ReportCard> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<ReportCard> getAll(){
        return repository.findAll();
    }

    //update
    public ReportCard updateReportCard(ReportCard reportCard, Long id){
        Optional <ReportCard> oldReportCard = repository.findById(id);

        if(oldReportCard.isPresent()){
            ReportCard newReportCard = oldReportCard.get();



            return repository.save(newReportCard);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteReportCard(Long id){
        repository.deleteById(id);
    }

}
