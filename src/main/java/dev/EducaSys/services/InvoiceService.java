package dev.EducaSys.services;

import dev.EducaSys.entities.Invoice;
import dev.EducaSys.repositories.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository){
        this.repository= repository;
    }

    //create
    public Invoice create(Invoice invoice){
        return repository.save(invoice);
    }

    //getAll
    public List<Invoice> getAll(){
        return repository.findAll();
    }

    //getById
    public Optional<Invoice> getById(Long id){
        return repository.findById(id);
    }

    //update
    public Invoice updateById(Invoice invoice, Long id){
        Optional<Invoice> oldInvoice = repository.findById(id);

        if(oldInvoice.isPresent()){
            Invoice newInvoice = oldInvoice.get();

            newInvoice.setExpeditionDate(invoice.getExpeditionDate());
            newInvoice.setExpirationDate(invoice.getExpirationDate());
            newInvoice.setAmount(invoice.getAmount());

            return repository.save(newInvoice);

        } else {
            throw new RuntimeException("Id not found");
        }
    }

    //delete
    public void deleteById(Long id){
        repository.deleteById(id);
    }

}
