<script>
import axios from 'axios'
import * as echarts from 'echarts';
import {mapState,mapActions} from 'pinia'
import {useStore} from '../stores/store.js'
import { CENTERED_ALIGNMENT } from 'element-plus/es/components/virtual-list/src/defaults';


var barChartPro
var barChartPort
var barChartApp

var proInitialized = 0
var portInitialized = 0
var appInitialized = 0

export default{
    
    setup(){
        const store = useStore();
        return {store};
    },


    mounted(){
        
    },


    data(){
        return{
            proInfo: [],
            proSta: [],
            portInfo: [],
            portSta: [],
            compDis: [],
            appSta: []
        }
    },

    methods:{
        showProInfo(){
            this.store.type = 'showProInfo';
            axios.get("http://localhost:12345/api/protocol_information")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    this.proInfo = [];
                    var idList = res.data.idList;
                    var proList = res.data.protocolList;
                    for(var i = 0; i < idList.length; i ++){
                        this.proInfo.push({id : idList[i], protocol : proList[i]});
                    }
                    this.store.proInfo = this.proInfo;
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        },
        
        showProSta(){
            this.store.type = 'showProSta';
            axios.get("http://localhost:12345/api/protocol_statistics")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){

                    if(proInitialized === 0){
                        proInitialized = 1;
                        barChartPro = echarts.init(document.getElementById('barChartPro'));
                    }
                    
                    var option = {
                            title: {
                                text: 'protocol statistics',
                                left: 'center'
                            },
                            tooltip: {},
                            xAxis: {
                                data: ['tcp', 'udp', 'sctp', 'dccp', 'rsvp', 'rudp', 'tls', 'quic', 'spx', 'mptcp']
                            },
                            yAxis: {},
                            series: [
                                {
                                    name: 'number',
                                    type: 'bar',
                                    data: []
                                }
                            ]
                        }
                    option.series[0].data.push(res.data.comProSta.tcp);
                    option.series[0].data.push(res.data.comProSta.udp);
                    option.series[0].data.push(res.data.comProSta.sctp);
                    option.series[0].data.push(res.data.comProSta.dccp);
                    option.series[0].data.push(res.data.comProSta.rsvp);
                    option.series[0].data.push(res.data.comProSta.rudp);
                    option.series[0].data.push(res.data.comProSta.tls);
                    option.series[0].data.push(res.data.comProSta.quic);
                    option.series[0].data.push(res.data.comProSta.spx);
                    option.series[0].data.push(res.data.comProSta.mptcp);
                    
                    barChartPro.setOption(option);
                    
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        },
        
        showPortInfo() {
            this.store.type = 'showPortInfo';
            axios.get("http://localhost:12345/api/port_information")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    var idList = res.data.idList;
                    var portList = res.data.portList;
                    this.portInfo = [];
                    for(var i = 0; i < idList.length; i ++){
                        this.portInfo.push({id : idList[i], port : portList[i]});
                    }
                    this.store.portInfo = this.portInfo;
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })


        },
        
        showPortSta(){
            this.store.type = 'showPortSta';
            axios.get("http://localhost:12345/api/port_statistics")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    if(portInitialized === 0){
                        portInitialized = 1;
                        barChartPort = echarts.init(document.getElementById('barChartPort'));
                    }
                    
                    var comPortSta = res.data.comPortSta;
                    var option = {
                            title: {
                                text: 'port statistics',
                                left: 'center'
                            },
                            tooltip: {},
                            xAxis: {
                                data: ['80', '443', '20', '21', '22', '23', '25', '110', '143', 
                                        '53', '161', '123', '67', '68', '69', '3389', '5060', '8000']
                            },
                            yAxis: {},
                            series: [
                                {
                                    name: 'number',
                                    type: 'bar',
                                    data: []
                                }
                            ]
                        }
                        option.series[0].data.push(comPortSta.port_80)
                        option.series[0].data.push(comPortSta.port_443)
                        option.series[0].data.push(comPortSta.port_20)
                        option.series[0].data.push(comPortSta.port_21)
                        option.series[0].data.push(comPortSta.port_22)
                        option.series[0].data.push(comPortSta.port_23)
                        option.series[0].data.push(comPortSta.port_25)
                        option.series[0].data.push(comPortSta.port_110)
                        option.series[0].data.push(comPortSta.port_143)
                        option.series[0].data.push(comPortSta.port_53)
                        option.series[0].data.push(comPortSta.port_161)
                        option.series[0].data.push(comPortSta.port_123)
                        option.series[0].data.push(comPortSta.port_67)
                        option.series[0].data.push(comPortSta.port_68)
                        option.series[0].data.push(comPortSta.port_69)
                        option.series[0].data.push(comPortSta.port_3389)
                        option.series[0].data.push(comPortSta.port_5060)
                        option.series[0].data.push(comPortSta.port_8000)

                        barChartPort.setOption(option);
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        },
        
        showCompDisplay(){
            this.store.type = 'compDisplay';
            axios.get("http://localhost:12345/api/comprehensive_display")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    var encMsgList = res.data.encMsgList;
                    console.log(encMsgList);
                    this.compDis = [];
                    for(var i = 0; i < encMsgList.length; i ++){
                        this.compDis.push({id : encMsgList[i].id, catalogue : encMsgList[i].catalogue,
                        port : encMsgList[i].port, protocol : encMsgList[i].protocol});
                    }
                    this.store.compDis = this.compDis;
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        },

        clearDatabase(){
            axios.get("http://localhost:12345/api/clear_database")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    console.log("success!");
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        },

        showAppStatistics(){
            this.store.type = 'showAppSta';
            axios.get("http://localhost:12345/api/app_statistics")
            .then(res => {
                console.log(res);
                var success = res.data.success;
                if(success){
                    if(appInitialized === 0){
                        appInitialized = 1;
                        barChartApp = echarts.init(document.getElementById('barChartApp'));
                    }
                    
                    var appSta = res.data.appSta;
                    var option = {
                            title: {
                                text: 'application statistics',
                                left: 'center'
                            },
                            tooltip: {},
                            xAxis: {
                                data: ['wx', 'qq', 'https']
                            },
                            yAxis: {},
                            series: [
                                {
                                    name: 'number',
                                    type: 'bar',
                                    data: []
                                }
                            ]
                        }
                        option.series[0].data.push(appSta.wx);
                        option.series[0].data.push(appSta.qq);
                        option.series[0].data.push(appSta.https);
                        barChartApp.setOption(option);
                }
                else {
                    console.log("Error occurred.");
                }
            }, err => {
                console.log(err);
            })
        }
    }
    
}    

</script>

<template>
    <div id="aside">
        <el-text class="mx-1" type="primary">功能展示</el-text>
        <div id="inner">
            <el-button class="button" type="primary" plain @click="showProInfo">展示协议信息</el-button>
            <el-button class="button" type="primary" plain @click="showProSta">常用协议统计</el-button>
            <el-button class="button" type="primary" plain @click="showPortInfo">展示端口信息</el-button>
            <el-button class="button" type="primary" plain @click="showPortSta">常用端口统计</el-button>
            <el-button class="button" type="primary" plain @click="showAppStatistics">应用统计结果</el-button>
            <el-button class="button" type="primary" plain @click="showCompDisplay">综合结果展示</el-button>
            <el-button class="button" type="primary" plain @click="clearDatabase">清空数据库</el-button>
        </div>
    </div>
</template>

<style scoped>
    #aside{
        display: flex;
        flex-direction: column;
        width: 200px;
        height: calc(90vh);
        background-color: #67C23A;
        border-radius: 15px;
        margin-top: 10px;
        justify-content: space-between;
    }
    .button{
        display: flex;
        justify-content: center;
        /* align-items: center; */
        margin-top: 10px;
        margin-bottom: 10px;
        margin-left: 30px !important;
        margin-right: 30px !important;
        border-radius: 10px;
        width: 125px;
        height: 40px;
        color: black;
        background-color: rgba(195, 189, 158, 0.867);
        /* font-weight: bold; */
    }
    .mx-1{
        margin-top: 0;
        height: 80px;
        width: 100%;
        background-color: #F56C6C;
        border-radius:15px;
        line-height: 80px;
        color:black;
        font-weight: bold;
    }
    #inner{
        display: flex;
        flex-direction: column;
        justify-content: space-evenly;
        align-items: center;
        height: 600px;
        background-color: #73e48f;
        /* margin-left: 15px;
        margin-right: 15px; */
        border-radius: 10px;
    }
</style>