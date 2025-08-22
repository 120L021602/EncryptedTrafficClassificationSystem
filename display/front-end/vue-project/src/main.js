import './assets/main.css'


import { createPinia } from "pinia";
import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

import axios from 'axios'
// Vue.prototype.$axios = axios
const pinia = createPinia()

const app = createApp(App)
// app.use(ElementPlus, { size: 'small', zIndex: 3000 })

app.use(ElementPlus)
app.use(pinia)

app.mount('#app')
