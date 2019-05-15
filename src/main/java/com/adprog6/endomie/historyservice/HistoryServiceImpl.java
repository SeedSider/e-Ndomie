//package com.adprog6.endomie.historyservice;
//import com.adprog6.endomie.history.History;
//import org.springframework.stereotype.Service;
//import com.adprog6.endomie.repositories.HistoryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@Service
//public class HistoryServiceImpl implements HistoryService{
//
//    private HistoryRepository historyRepository;
//
//    @Autowired
//    public void setHistoryRepository() {
//        setHistoryRepository();
//    }
//
//    @Autowired
//    public void setHistoryRepository(HistoryRepository historyRepository) {
//        this.historyRepository = historyRepository;
//    }
//
//    @Override
//    public Iterable<History> listAllHistory() {
//        return historyRepository.findAll();
//    }
//
//    @Override
//    public History getHistoryById(Integer id) {
//        return (History) historyRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public History saveHistory(History history) {
//        return historyRepository.save(history);
//    }
//
//    @Override
//    public void deleteHistory(Integer id) {
//        historyRepository.deleteById(id);
//    }
//}
//
