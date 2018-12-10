package org.mycom.account;

public interface AccountPersistService {
    /**
     * 注册账户
     * @param account
     * @return
     * @throws AccountPersistException
     */
    Account createAccount(Account account) throws AccountPersistException;

    /**
     * 查询账户
     * @param id
     * @return
     * @throws AccountPersistException
     */
    Account readAccount(String id) throws AccountPersistException;

    /**
     * 删除账户
     * @param id
     * @throws AccountPersistException
     */
    void deleteAccount(String id) throws AccountPersistException;

    /**
     * 更新账户
     * @param account
     * @return
     * @throws AccountPersistException
     */
    Account updateAccount( Account account )  throws AccountPersistException;
}
