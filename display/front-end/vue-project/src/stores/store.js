import {defineStore} from 'pinia'
export const useStore = defineStore('main', {
    state: () => ({
        proInfo: [],
        proXData: [],
        proYData: [],
        portInfo: [],
        portXData: [],
        portYdata: [],
        compDis: [],
        type: 'showCalendar'
      })
  })