
import axios from 'axios'
import Util from '../../utils/util'
const util = new Util()

const state = () => ({
})

const getters = {
}

const mutations = {
}

const actions = {
  async uploadImage({}, { image }) {
    try {
      const formData = new FormData();
      formData.append('image', image)
      const res = await axios.post('/reporters/image', formData, {
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      })
      
      return { status: res.status, imageUrl: res.data.imageUrl }
    } catch(err) {
      return { status: err.response.status }
    }
  },

  async newPost({}, { title, subTitle, categoryId, mainImage, content }) {
    try {
      const res = await axios.post('/reporters/article', { categoryId, title, subTitle, content, mainImage }, {
        headers: {
          'Content-Type': 'application/json'
        }
      })
      
      return { status: res.status }
    } catch(err) {
      return { status: err.response.status }
    }
  }

}

export default {
  namespaced: true,
  state,
  getters,
  mutations,
  actions
}
