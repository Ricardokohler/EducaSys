package com.educasys.services;

import com.educasys.entitites.Invoice;
import com.educasys.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {


    //Injeção de dependência
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }


    //create
    public Invoice createInvoice(Invoice invoice){
        return repository.save(invoice);
    }

    //get all
    public Optional <Invoice> getById(Long id){
        return repository.findById(id);
    }

    //getAll
    public List<Invoice> getAll(){
        return repository.findAll();
    }

    //update
    public Invoice updateInvoice(Invoice invoice, Long id){
        Optional <Invoice> oldInvoice = repository.findById(id);

        if(oldInvoice.isPresent()){
            Invoice newInvoice = oldInvoice.get();

            newInvoice.setAmount(invoice.getAmount());
            newInvoice.setHolder(invoice.getHolder());

            return repository.save(newInvoice);
        } else throw new RuntimeException("id not found");

    }

    //delete
    public void deleteInvoice(Long id){
        repository.deleteById(id);
    }

}
