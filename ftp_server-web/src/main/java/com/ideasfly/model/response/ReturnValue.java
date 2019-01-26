package com.ideasfly.model.response;

/**
 * create by lanxuewei in 2018/4/15 22:29
 * description: controller 统一返回结果model
 */
public class ReturnValue<T> {

    /**
     * 状态码
     */
    private Integer code = null;
    /**
     * 状态信息
     */
    private String info = null;
    /**
     * 返回数据
     */
    private T data = null;

    /**
     * 表示无返回数据
     *
     * @param code
     * @param info
     */
    public ReturnValue(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    /**
     * 完整返回结果(包含数据)
     *
     * @param code
     * @param info
     * @param data
     */
    public ReturnValue(Integer code, String info, T data) {
        this.code = code;
        this.info = info;
        this.data = data;
    }

    public ReturnValue(ReturnCodeAndMsgEnum codeAndMsg) {
        this(codeAndMsg.getCode(), codeAndMsg.getInfo());
    }

    public ReturnValue(ReturnCodeAndMsgEnum codeAndMsgEnum, T data) {
        this(codeAndMsgEnum.getCode(), codeAndMsgEnum.getInfo(), data);
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }

    public Object getData() {
        return data;
    }

}
