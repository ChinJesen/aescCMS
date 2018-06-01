package cn.com.aesc.service.resources;

import cn.com.aesc.pojo.resources.Resources;
import cn.com.aesc.service.IService;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface ResourcesService extends IService<Resources> {

  PageInfo<Resources> selectByPage(Resources resources, int start, int length);

  List<Resources> queryAll();

  List<Resources> loadUserResources(Map<String, Object> map);

  List<Resources> queryResourcesListWithSelected(Integer rid);
}
