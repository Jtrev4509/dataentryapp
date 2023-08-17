<template>
    <div class="user-info">
      <div class="input-row">
        <label for="name">*Name:</label>
        <input v-model="user.name" type="text" id="name">
      </div>
      <div class="input-row">
        <label for="age">Age:</label>
        <input v-model="user.age" type="number" id="age">
      </div>
      <div class="input-row">
        <label for="title">*Title:</label>
        <input v-model="user.title" type="text" id="title">
      </div>
      <div class="input-row">
        <label for="hometown">Hometown:</label>
        <input v-model="user.hometown" type="text" id="hometown">
      </div>
      <div>* = required field</div>
    </div>
    <button @click="submitForm">Submit</button>
  </template>
  
  <script>
  export default {
    data() {
      return {
        user: {
          name: '',
          age: null,
          title: '',
          hometown: ''
        }
      };
    },
    methods: {
        submitForm() {
            const user = {
                name: this.user.name,
                age: this.user.age,
                title: this.user.title,
                hometown: this.user.hometown
            };
            console.log('User data submitted:', user);
        }
    }
  }
  </script>
  
  <style scoped>
  .user-info {
    max-width: 400px;
    margin: 0 auto;
  }
  
  .input-row {
    margin-bottom: 15px;
  }
  
  label {
    display: inline-block;
    width: 100px;
  }
  </style>