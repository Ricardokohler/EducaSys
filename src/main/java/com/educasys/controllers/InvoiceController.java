package com.educasys.controllers;

import com.educasys.entitites.Invoice;
import com.educasys.services.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Invoices")
public class InvoiceController {

    private final InvoiceService service;

    public InvoiceController(InvoiceService service){
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity <String> createInvoice(@RequestBody Invoice invoice){
        Invoice createdInvoice = service.createInvoice(invoice);

        if(createdInvoice != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Invoice Created");

        } else throw new RuntimeException("Invoice not created.");
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Invoice>> getInvoiceById(@PathVariable Long id){
        Optional <Invoice> invoice = service.getById(id);

        if(invoice.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(invoice);
        } else throw new RuntimeException("Id not found");
    }

    @GetMapping("/all")
    public ResponseEntity <List<Invoice>> allInvoices(){
        List <Invoice> invoiceList = service.getAll();

        if(invoiceList != null){
            return ResponseEntity.status(HttpStatus.OK).body(invoiceList);
        } else throw new RuntimeException("List Empty");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity <Invoice> updateInvoice(@RequestBody Invoice invoice, @PathVariable Long id){
       Invoice updatedInvoice = service.updateInvoice(invoice, id);

       if(updatedInvoice != null){
           return ResponseEntity.status(HttpStatus.OK).body(invoice);
       } else throw new RuntimeException("Id not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> deleteInvoice(@PathVariable Long id){
        Optional <Invoice> deletedInvoice = service.getById(id);

        if(deletedInvoice.isPresent()){
            service.deleteInvoice(id);

            return ResponseEntity.status(HttpStatus.OK).body("Invoice successfully deleted!");
        } else throw new RuntimeException("Id not found :( ");
    }
}
