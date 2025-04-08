<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="缴费单号" prop="jiaofeidanhao">
            <el-input v-model="ruleForm.jiaofeidanhao" 
                placeholder="缴费单号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jiaofeidanhao" label="缴费单号" prop="jiaofeidanhao">
              <el-input v-model="ruleForm.jiaofeidanhao" 
                placeholder="缴费单号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="缴费月份" prop="jiaofeiyuefen">
          <el-input v-model="ruleForm.jiaofeiyuefen" 
              placeholder="缴费月份" clearable  :readonly="ro.jiaofeiyuefen"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费月份" prop="jiaofeiyuefen">
              <el-input v-model="ruleForm.jiaofeiyuefen" 
                placeholder="缴费月份" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="缴费名称" prop="jiaofeimingcheng">
          <el-input v-model="ruleForm.jiaofeimingcheng" 
              placeholder="缴费名称" clearable  :readonly="ro.jiaofeimingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费名称" prop="jiaofeimingcheng">
              <el-input v-model="ruleForm.jiaofeimingcheng" 
                placeholder="缴费名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="缴费类型" prop="jiaofeileixing">
          <el-select v-model="ruleForm.jiaofeileixing" placeholder="请选择缴费类型">
            <el-option
                v-for="(item,index) in jiaofeileixingOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费类型" prop="jiaofeileixing">
	      <el-input v-model="ruleForm.jiaofeileixing"
                placeholder="缴费类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="缴费金额" prop="jiaofeijine">
          <el-input v-model="ruleForm.jiaofeijine" 
              placeholder="缴费金额" clearable  :readonly="ro.jiaofeijine"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费金额" prop="jiaofeijine">
              <el-input v-model="ruleForm.jiaofeijine" 
                placeholder="缴费金额" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="缴费备注" prop="jiaofeibeizhu">
          <el-input v-model="ruleForm.jiaofeibeizhu" 
              placeholder="缴费备注" clearable  :readonly="ro.jiaofeibeizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费备注" prop="jiaofeibeizhu">
              <el-input v-model="ruleForm.jiaofeibeizhu" 
                placeholder="缴费备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="老人编号" prop="laorenbianhao">
          <el-select  @change="laorenbianhaoChange" v-model="ruleForm.laorenbianhao" placeholder="请选择老人编号">
            <el-option
                v-for="(item,index) in laorenbianhaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.laorenbianhao" label="老人编号" prop="laorenbianhao">
              <el-input v-model="ruleForm.laorenbianhao" 
                placeholder="老人编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="老人姓名" prop="laorenxingming">
          <el-input v-model="ruleForm.laorenxingming" 
              placeholder="老人姓名" clearable  :readonly="ro.laorenxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="老人姓名" prop="laorenxingming">
              <el-input v-model="ruleForm.laorenxingming" 
                placeholder="老人姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua" 
              placeholder="联系电话" clearable  :readonly="ro.lianxidianhua"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="联系电话" prop="lianxidianhua">
              <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="缴费状态" prop="jiaofeizhuangtai">
          <el-select v-model="ruleForm.jiaofeizhuangtai" placeholder="请选择缴费状态">
            <el-option
                v-for="(item,index) in jiaofeizhuangtaiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="缴费状态" prop="jiaofeizhuangtai">
	      <el-input v-model="ruleForm.jiaofeizhuangtai"
                placeholder="缴费状态" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工工号" prop="yuangonggonghao">
          <el-input v-model="ruleForm.yuangonggonghao" 
              placeholder="员工工号" clearable  :readonly="ro.yuangonggonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工工号" prop="yuangonggonghao">
              <el-input v-model="ruleForm.yuangonggonghao" 
                placeholder="员工工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming" 
              placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工姓名" prop="yuangongxingming">
              <el-input v-model="ruleForm.yuangongxingming" 
                placeholder="员工姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="缴费内容" prop="jiaofeineirong">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="缴费内容"
                  v-model="ruleForm.jiaofeineirong" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.jiaofeineirong" label="缴费内容" prop="jiaofeineirong">
                    <span>{{ruleForm.jiaofeineirong}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 255, 102, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"rgba(255, 255, 255, 0.25)","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(25, 169, 123, 1)","addEditBoxColor":"rgba(25, 169, 123, 0.11)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(25, 169, 123, 1)","uploadIconFontColor":"rgba(25, 169, 123, 1)","textareaBorderColor":"rgba(25, 169, 123, 1)","btnCancelBgColor":"rgba(255, 255, 102, 1)","selectLableColor":"rgba(25, 169, 123, 1)","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(0, 0, 0, 1)","dateBorderColor":"rgba(25, 169, 123, 1)","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(25, 169, 123, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(25, 169, 123, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"rgba(25, 169, 123, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(25, 169, 123, 1)","inputBorderColor":"rgba(25, 169, 123, 1)","uploadBorderColor":"rgba(25, 169, 123, 1)","textareaFontColor":"rgba(0, 0, 0, 1)","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"rgba(25, 169, 123, 1)","btnSaveBorderColor":"rgba(25, 169, 123, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	jiaofeidanhao : false,
	jiaofeiyuefen : false,
	jiaofeimingcheng : false,
	jiaofeileixing : false,
	jiaofeineirong : false,
	jiaofeijine : false,
	jiaofeibeizhu : false,
	laorenbianhao : false,
	laorenxingming : false,
	lianxidianhua : false,
	jiaofeizhuangtai : false,
	yuangonggonghao : false,
	yuangongxingming : false,
	ispay : false,
      },
      ruleForm: {
        jiaofeidanhao: this.getUUID(),
        jiaofeiyuefen: '',
        jiaofeimingcheng: '',
        jiaofeileixing: '',
        jiaofeineirong: '',
        jiaofeijine: '',
        jiaofeibeizhu: '',
        laorenbianhao: '',
        laorenxingming: '',
        lianxidianhua: '',
        jiaofeizhuangtai: '',
        yuangonggonghao: '',
        yuangongxingming: '',
      },
          jiaofeileixingOptions: [],
          laorenbianhaoOptions: [],
          jiaofeizhuangtaiOptions: [],
      rules: {
          jiaofeidanhao: [
          ],
          jiaofeiyuefen: [
          ],
          jiaofeimingcheng: [
          ],
          jiaofeileixing: [
                { required: true, message: '缴费类型不能为空', trigger: 'blur' },
          ],
          jiaofeineirong: [
          ],
          jiaofeijine: [
                { required: true, message: '缴费金额不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          jiaofeibeizhu: [
          ],
          laorenbianhao: [
          ],
          laorenxingming: [
          ],
          lianxidianhua: [
                { validator: validateMobile, trigger: 'blur' },
          ],
          jiaofeizhuangtai: [
                { required: true, message: '缴费状态不能为空', trigger: 'blur' },
          ],
          yuangonggonghao: [
          ],
          yuangongxingming: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {
  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='jiaofeidanhao'){
            this.ruleForm.jiaofeidanhao = obj[o];
	    this.ro.jiaofeidanhao = true;
            continue;
          }
          if(o=='jiaofeiyuefen'){
            this.ruleForm.jiaofeiyuefen = obj[o];
	    this.ro.jiaofeiyuefen = true;
            continue;
          }
          if(o=='jiaofeimingcheng'){
            this.ruleForm.jiaofeimingcheng = obj[o];
	    this.ro.jiaofeimingcheng = true;
            continue;
          }
          if(o=='jiaofeileixing'){
            this.ruleForm.jiaofeileixing = obj[o];
	    this.ro.jiaofeileixing = true;
            continue;
          }
          if(o=='jiaofeineirong'){
            this.ruleForm.jiaofeineirong = obj[o];
	    this.ro.jiaofeineirong = true;
            continue;
          }
          if(o=='jiaofeijine'){
            this.ruleForm.jiaofeijine = obj[o];
	    this.ro.jiaofeijine = true;
            continue;
          }
          if(o=='jiaofeibeizhu'){
            this.ruleForm.jiaofeibeizhu = obj[o];
	    this.ro.jiaofeibeizhu = true;
            continue;
          }
          if(o=='laorenbianhao'){
            this.ruleForm.laorenbianhao = obj[o];
	    this.ro.laorenbianhao = true;
            continue;
          }
          if(o=='laorenxingming'){
            this.ruleForm.laorenxingming = obj[o];
	    this.ro.laorenxingming = true;
            continue;
          }
          if(o=='lianxidianhua'){
            this.ruleForm.lianxidianhua = obj[o];
	    this.ro.lianxidianhua = true;
            continue;
          }
          if(o=='jiaofeizhuangtai'){
            this.ruleForm.jiaofeizhuangtai = obj[o];
	    this.ro.jiaofeizhuangtai = true;
            continue;
          }
          if(o=='yuangonggonghao'){
            this.ruleForm.yuangonggonghao = obj[o];
	    this.ro.yuangonggonghao = true;
            continue;
          }
          if(o=='yuangongxingming'){
            this.ruleForm.yuangongxingming = obj[o];
	    this.ro.yuangongxingming = true;
            continue;
          }
        }
        this.ruleForm.jiaofeijine = 0
	this.ro.jiaofeijine = false;
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.yuangonggonghao!=''&&json.yuangonggonghao){
              		this.ruleForm.yuangonggonghao = json.yuangonggonghao
		}
		if(json.yuangongxingming!=''&&json.yuangongxingming){
              		this.ruleForm.yuangongxingming = json.yuangongxingming
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.jiaofeileixingOptions = "住宿费,伙食费,其它费用".split(',')
            this.$http({
              url: `option/laoren/laorenbianhao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.laorenbianhaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
            this.jiaofeizhuangtaiOptions = "缴费,已经缴费,欠费".split(',')
    },
    // 下二随
    laorenbianhaoChange () {
      this.$http({
        url: `follow/laoren/laorenbianhao?columnValue=`+ this.ruleForm.laorenbianhao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.laorenxingming){
                this.ruleForm.laorenxingming = data.data.laorenxingming
              }
              if(data.data.lianxidianhua){
                this.ruleForm.lianxidianhua = data.data.lianxidianhua
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `jiaofeixinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}
      // ${column.compare}






      var obj = this.$storage.getObj('crossObj');
      var table = this.$storage.getObj('crossTable');
      if(obj!=null) {
	      obj.jiaofeijine = obj.jiaofeijine - this.ruleForm.jiaofeijine
	      if(obj.jiaofeijine<0){
		this.$message.error("缴费金额不足");
		return
	      }
	      this.$http({
		  url: `${table}/update`,
		  method: "post",
		  data: obj
		}).then(({ data }) => {});
      }








      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `jiaofeixinxi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.jiaofeixinxiCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.jiaofeixinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
