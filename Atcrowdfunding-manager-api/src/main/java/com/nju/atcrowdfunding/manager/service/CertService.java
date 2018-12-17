package com.nju.atcrowdfunding.manager.service;

import java.util.List;
import java.util.Map;

import com.nju.atcrowdfunding.bean.Cert;
import com.nju.atcrowdfunding.bean.MemberCert;
import com.nju.atcrowdfunding.util.Page;
import com.nju.atcrowdfunding.vo.Data;

/**
 * 资质模块的业务接口
 */
public interface CertService {
	public Cert queryCert(Map<String, Object> paramMap);

	public Page<Cert> pageQuery(Map<String, Object> paramMap);

	public int queryCount(Map<String, Object> paramMap);

	public void insertCert(Cert cert);

	public Cert queryById(Integer id);

	public int updateCert(Cert cert);

	public int deleteCert(Integer id);

	public int deleteCerts(Data ds);

	public List<Cert> queryCertByAccttype(String accttype);

	public List<Cert> queryAllCert();

	public List<Map<String, Object>> queryAllAccttypeCert();

	public int insertAccttypeCert(Map<String, Object> map);

	public int deleteAccttypeCert(Map<String, Object> map);

	public void saveMemberCert(List<MemberCert> certimgs);


}
