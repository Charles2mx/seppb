package com.pr.sepp.mgr.system.dao;

import java.util.List;
import java.util.Map;
import com.pr.sepp.mgr.system.model.SettingConfig;
import com.pr.sepp.mgr.system.model.SystemSetting;

public interface SettingDAO {
	List<Map<String, Object>> listConfig();

	int configCreate(SettingConfig config);

	int configUpdate(SettingConfig config);

	int configDelete(int configId);

	List<Map<String, Object>> listSetting();

	int settingCreate(SystemSetting settting);

	int settingUpdate(SystemSetting settting);

	int settingDelete(int setttingId);

	SystemSetting findSetting(Integer settingType);
}