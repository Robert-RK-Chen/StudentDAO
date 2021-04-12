package dao;

import bean.*;

import java.util.*;

/**
 * @author Robert Chen
 * @author Wang HuaDong
 */
public interface StudentDAO
{
    /**
     * �����ݿ��в���ѧ������Ϣ
     *
     * @param s һ��ѧ����ʵ��
     */
    void insert(Student s);

    /**
     * �������ݿ���ѧ������Ϣ
     *
     * @param s һ��ѧ����ʵ��
     */
    void update(Student s);

    /**
     * ɾ�����ݿ���ѧ������Ϣ
     *
     * @param id ���ַ������͡�ѧ����ѧ��
     */
    void delete(long id);

    /**
     * ��ѯ���ݿ���ѧ��ΪiD��ѧ����Ϣ
     *
     * @param id �������͡�ѧ����ѧ��
     * @return Student ����һ��ѧ����ʵ��
     */
    Student findById(long id);

    /**
     * չʾ���ݿ�������ѧ������Ϣ
     *
     * @return List<Student> ����һ��ѧ�����б�
     */
    List<Student> findAll();
}
