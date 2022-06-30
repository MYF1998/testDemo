package cn.ty.service;

import cn.ty.pojo.Abc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbcService extends JpaRepository<Abc,Integer> {
}
