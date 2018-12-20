package xmlmapper;

import pojo.AdsConfig;

public interface AdsConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdsConfig record);

    int insertSelective(AdsConfig record);

    AdsConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdsConfig record);

    int updateByPrimaryKey(AdsConfig record);
}