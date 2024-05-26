package sqltest.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sqltest.demo.repository.ILopRepository;
import java.util.List;
import sqltest.demo.entity.Lop;

@Service
public class LopService {
    @Autowired
    private ILopRepository lopRepository;

    public List<Lop> getAllLop()
    {
        return lopRepository.findAll();
    }

    public Lop getLopById(Long id){
        return lopRepository.findById(id).orElse(null);
    }

    public void addLop(Lop lop){
        lopRepository.save(lop);
    }
    public void deleteLop(Long id){
        lopRepository.deleteById(id);
    }

    public void updateLop(Lop lop){
        lopRepository.save(lop);
    }
}
