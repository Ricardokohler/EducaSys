package dev.EducaSys.controllers;

import dev.EducaSys.entities.Invoice;
import dev.EducaSys.services.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Invoices")
public class InvoiceController {

        private final InvoiceService service;

        public InvoiceController(InvoiceService service){
            this.service= service;
        }

        @PostMapping("/add")
        public ResponseEntity<Invoice> create(@RequestBody Invoice invoice){
            Invoice createdInvoice = service.create(invoice);

            return new ResponseEntity<>(createdInvoice, HttpStatus.CREATED);
        }

        @GetMapping("/all")
        public ResponseEntity<List<Invoice>> getAll(){
            List<Invoice> InvoiceList = service.getAll();

            return new ResponseEntity<>(InvoiceList, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<?> getById(@PathVariable Long id){
            Optional<Invoice> optionalInvoice = service.getById(id);

            if(optionalInvoice.isPresent()){
                return new ResponseEntity<>(optionalInvoice, HttpStatus.OK);
            } else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found!");
            }
        }

        @PutMapping("/update/{id}")
        public ResponseEntity<?> updateInvoice(@PathVariable Long id, @RequestBody Invoice invoice){

            try {
                Invoice updatedInvoice = service.updateById(invoice, id);

                return new ResponseEntity<>(updatedInvoice, HttpStatus.OK);

            } catch (RuntimeException e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteInvoice(@PathVariable Long id){
            Optional<Invoice> deletedInvoice = service.getById(id);

            if (deletedInvoice.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body("Invoice deleted");

            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id not found");
            }
        }

}
