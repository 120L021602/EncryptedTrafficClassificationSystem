<script>
import * as echarts from 'echarts';
import {defineStore} from 'pinia'
import {useStore} from '../stores/store.js'



export default{
    
    setup(){
        const store = useStore();
        return {store};
    },

    // mounted(){
    //     this.store.type = "showCalendar";
    // }
}

</script>

<template>
    <div id="outer">
        <el-calendar v-show="store.type === 'showCalendar'">
        <template #date-cell="{ data }">
          <p :class="data.isSelected ? 'is-selected' : ''">
            {{ data.day.split('-').slice(1).join('-') }}
            {{ data.isSelected ? '✔️' : '' }}
          </p>
        </template>
      </el-calendar>
        <div id="main" v-show="store.type === 'showPortInfo'">
            <el-table :data="store.portInfo" border style="width: 90%">
                <el-table-column prop="id" label="Id" width="400" />
                <el-table-column prop="port" label="Port" />
            </el-table>
        </div>

        <div id="main" v-show="store.type === 'showProInfo'">
            <el-table :data="store.proInfo" border style="width: 90%">
                <el-table-column prop="id" label="Id" width="400" />
                <el-table-column prop="protocol" label="Protocol" />
            </el-table>
        </div>

        <div id="main" v-show="store.type === 'compDisplay'">
            <el-table :data="store.compDis" border style="width: 90%">
                <el-table-column prop="id" label="Id" width="200" />
                <el-table-column prop="catalogue" label="Catalogue" width="200" />
                <el-table-column prop="port" label="Port" width="200"/>
                <el-table-column prop="protocol" label="Protocol"/>
            </el-table>
        </div>

        <div id="barChartPro" v-show="store.type === 'showProSta'">

        </div>

        <div id="barChartPort" v-show="store.type === 'showPortSta'">

        </div>

        <div id="barChartApp" v-show="store.type === 'showAppSta'">

        </div>
    </div>
</template>

<style scoped>
    #main{
        display: flex;
        height: 620px;
        width: 1100px;
        /* background-color: #9016d2; */
        border-radius: 15px;
        margin: auto;
        border-style: solid;
        border-color:black;
        align-items: flex-start;
        justify-content: center;
        text-align: center;
        overflow: auto;
    }

    el-table-column{
        margin:0 auto;
        
    }

    el-table{
        margin:0 auto;
        
        
    }

    #barChartPro{
        width: 900px;
        height: 650px;
        
    }

    #barChartPort{
        width: 900px;
        height: 650px;
        
    }

    #barChartApp{
        width: 900px;
        height: 650px;
    }

    #outer{
        display: flex;
        align-items: center;
        text-align: center;
        justify-content: center;
        overflow-y: auto;
    }

</style>