package com.adprog6.endomie.controllers;


import com.adprog6.endomie.exception.ResourceNotFoundException;
import com.adprog6.endomie.history.History;
import com.adprog6.endomie.historyservice.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class HistoryController {

    @Autowired
    private HistoryService historyService;


    @GetMapping(value = "/histories")
    public Iterable<History> getAllHistories() {
        return historyService.listAllHistory();
    }

    @PostMapping("/history")
    public History createHistory(@Valid @RequestBody History history) {
        return historyService.saveHistory(history);
    }

    @GetMapping("/history/{id}")
    public History getHistoryById(@PathVariable(value = "id") Integer id) {
        return Optional.ofNullable(historyService.getHistoryById(id)).
                orElseThrow( () -> new ResourceNotFoundException("History", "id", id));
    }

    @PutMapping("/history/{id}")
    public History updateHistory(@PathVariable(value = "id") Integer id,
                           @Valid @RequestBody History historyDetails) {

        History history = Optional.ofNullable(historyService.getHistoryById(id))
                .orElseThrow(() -> new ResourceNotFoundException("History", "id", id));

        history.setUsername(historyDetails.getUsername());

        History updatedHistory = historyService.saveHistory(history);
        return updatedHistory;
    }

    @DeleteMapping("/history/{id}")
    public ResponseEntity<?> deleteHistory(@PathVariable(value = "id") Integer id) {
        History history = Optional.ofNullable(historyService.getHistoryById(id))
                .orElseThrow(() -> new ResourceNotFoundException("History", "id", id));

        historyService.deleteHistory(history.getIndex());

        return ResponseEntity.ok().build();
    }
}
