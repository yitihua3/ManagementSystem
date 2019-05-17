package cn.edu.nenu.repository;

import cn.edu.nenu.domain.Dict;

public interface DictRepository {

  public   Dict findone(Long pkId);

  public   Dict save(Dict entity);

  public Iterable<Dict> save(Iterable<Dict> entities);

  public  void delete(Long pkId);
}
