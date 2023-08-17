<template>
    <div class="centered-container">
    <div class="user-info">
        <h2 class="input-row">ENTER YOUR INFO BELOW</h2>
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
      <div class="input-row">* = required field</div>
    </div>
    <button @click="submitForm">Submit</button>
    </div>
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
      if (this.user.name && this.user.title) {
        // Only submit if name and title are filled
        const user = {
          name: this.user.name,
          age: this.user.age,
          title: this.user.title,
          hometown: this.user.hometown
        };
        this.$emit('user-submitted', user);
        this.$router.push({ name: 'usersList', params: { user } });
      } else {
        // Show error message or take appropriate action
        alert('Name and title are required fields.');
      }
    }
  }
}
</script>

<style scoped>
.centered-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  height: 100vh;
  font-family: Arial, sans-serif;
}

.user-info {
  max-width: 400px;
  width: 100%;
  padding: 20px;
  border: 1px solid #ccc;
  background-color: #f9f9f9;
  border-radius: 5px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.input-row {
  margin-bottom: 15px;
}

label {
  display: inline-block;
  width: 100px;
}

button {
  padding: 10px 20px;
  background-color: black;
  color: white;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: grey;
}
</style>
 