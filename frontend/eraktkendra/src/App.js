import React from 'react'
import "./App.css"
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import HomePage from './components/HomePage'
import FieldWorkerDashboard from './FieldWorkerComponents/FieldWorkerDashboard'
import UserLogin from './UserComponents/UserLogin'
import UserDashboard from './UserComponents/UserDashboard'

const App = () => {
  return (
    <div>
      <BrowserRouter>
      <Routes>
        <Route path='/' element = {<HomePage/>} />

        {/* User */}
        <Route path='/user' element = {<UserDashboard/>} />
        <Route path='/userLogin' element = {<UserLogin/>} />

        {/* FieldWorker */}
        <Route path='/fieldWorker' element = {<FieldWorkerDashboard/>} />

      </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App