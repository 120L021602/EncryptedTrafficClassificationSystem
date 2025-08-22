<script>
import Display from "./Display.vue"
import {defineStore} from 'pinia'
import {useStore} from '../stores/store.js'

export default{
    components:{
        Display
    },

    setup(){
        const store = useStore();
        return {store};
    },
    
    mounted(){
        this.store.type = "showCalendar";
    }
    
}
</script>

<template>
    <Display />
</template>