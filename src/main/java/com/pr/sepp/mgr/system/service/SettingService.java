package com.pr.sepp.mgr.system.service;

import java.util.List;
import java.util.Map;
import com.pr.sepp.mgr.system.model.SettingConfig;
import com.pr.sepp.mgr.system.model.SystemSetting;

public interface SettingService {
	List<Map<String, Object>> listConfig();

	int configCreate(SettingConfig setting);

	int configUpdate(SettingConfig setting);

	int configDelete(int configId);

	List<Map<String, Object>> listSetting();

	int settingCreate(SystemSetting setting);

	int settingUpdate(SystemSetting setting);

	int settingDelete(int settingId);
}