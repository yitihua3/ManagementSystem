package cn.edu.nenu.service;

import cn.edu.nenu.domain.Dict;
import cn.edu.nenu.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Dictservice {

    @Autowired
    private DictRepository dictRepository;

    public Dict findOne(Long pkId){
        return dictRepository.findone(pkId);
    }

    public Dict save(Dict entity){

        return dictRepository.save(entity);
    }

    public  Iterable<Dict> save(Iterable<Dict> entities){

        return dictRepository.save(entities);
    }

    public void  remove(Long pkId){
        dictRepository.delete(pkId);
    }
    public void remove(Dict entity){

    }

//    public Page<Dict> getEntityPage(Map<String, Object> f)
}
